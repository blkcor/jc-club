package me.blkcor.subject.infra.utils;

import org.jasypt.util.text.BasicTextEncryptor;

public class EncryptUtil {
    public static void main(String[] args) {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        //加密所需的秘钥（salt），解密敏感信息仍旧需要改值
        textEncryptor.setPassword("salt");
        //要加密的敏感信息
        String url = textEncryptor.encrypt("jdbc:mysql://<host>:<port>/jc-club?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        String username = textEncryptor.encrypt("username");
        String password = textEncryptor.encrypt("password");
        System.out.println("ENC("+url+")");
        System.out.println("ENC("+username+")");
        System.out.println("ENC("+password+")");
        System.out.println(textEncryptor.decrypt(username));
        System.out.println(textEncryptor.decrypt(password));
    }
}
