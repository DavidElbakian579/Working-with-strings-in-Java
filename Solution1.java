/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasyntaxpro10l5;

/**
 *
 * @author David-pc
 */
public class Solution1 {
    /* 1
    Проверка URL-адреса
    В этой задаче нужно выполнить проверку URL-адреса.
    Простая схема URL-адреса выглядит так:
    <сетевой протокол>://<название ресурса>.<домен>

    Метод checkProtocol(String) проверяет, какой сетевой протокол (http или https) у URL-адреса, 
    полученного входящим параметром, и возвращает результат проверки — строку название сетевого протокола. 
    А метод checkDomain(String) проверяет, какой домен (com, net, org или ru) у URL-адреса, 
    полученного входящим параметром, и возвращает результат проверки — строку название домена.

    Если URL-адрес начинается не с http или https, то результат будет — "неизвестный". 
    Если URL-адрес заканчивается не на com, net, org или ru, то результат будет — "неизвестный".
    */
    
    static String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
    
    public static void start() {
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }
        
    
    public static String checkProtocol(String url) {
        if (url.startsWith("https")) return "https";
        if (url.startsWith("http")) return "http";
        return "неизвестный";
    }

    public static String checkDomain(String url) {
        if (url.endsWith(".com")) return "com";
        if (url.endsWith(".net")) return "net";
        if (url.endsWith(".org")) return "org";
        if (url.endsWith(".ru")) return "ru";
        return "неизвестный";
    }
    
}
