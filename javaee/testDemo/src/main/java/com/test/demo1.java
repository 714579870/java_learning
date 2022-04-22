package com.test;

import javax.jws.soap.SOAPBinding;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demo1 {
    public static void main(String[] args) throws IOException {
        User user1 = new User("lihua", 33);
        User user2 = new User("lihua", 33);
//        System.out.println(user1.equals(user2));
//        System.out.println(user1==user2);
//        HashSet<User> ts = new HashSet<User>();
//        ts.add(user1);
//        ts.add(user2);
//        for (User t:ts) {
//            System.out.println(t.getName());
//
//        }
//        System.out.println(ts.toString());
//        ArrayList<User> users = new ArrayList<User>();
//        users.add(user1);
//        users.add(user2);
//        for (User us:users
//             ) {
//            System.out.println(us.toString());
//        }
//        ArrayList<Integer> integers = new ArrayList<>();
//        integers.add(22);
//        integers.add(223);
//        File file = new File("/ttt.txt");
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
//        oos.writeObject(integers);
////        InputStream inputStream = new InputStream("/ttt.txt");
//        FileInputStream inputStream = new FileInputStream(file);
//        byte[] bytes = new byte[1025];
//        int len;
//        while ((len=inputStream.read(bytes))!= -1){
//            System.out.println(new String(bytes,0,len));
//        }
//
//
//        System.out.println(bytes);
        Thread th1 = new Thread();
        Thread th2 = new Thread();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()-> th1.setName("wwww"));
        System.out.println(th1.getName());

    }


}
