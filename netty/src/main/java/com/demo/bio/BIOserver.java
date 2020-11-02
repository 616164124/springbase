/**
 * projectName: cloud2020- fileName: BIOserver.java packageName: com.demo.bio date: 2020-09-25
 * copyright(c) 2017-2020 xxx公司
 */
package com.demo.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @version: V1.0
 * @author: mikael
 * @className: BIOserver
 * @packageName: com.demo.bio
 * @description: bio类
 * @data: 2020-09-25
 */
public class BIOserver {
  public static void main(String[] args) throws IOException {

      // 创建线程池
      ExecutorService executorService = Executors.newCachedThreadPool();

      // 添加监听端口 6666
      ServerSocket serverSocket = new ServerSocket(6666);
      System.out.println("服务端开启 。。。。");
      while (true) {
          final Socket accept = serverSocket.accept();
          System.out.println("连接到客户端。。。。。");
          // 创建一个线程与之通信（单独写一个方法）
          executorService.execute(
                  new Runnable() {
                      @Override
                      public void run() { // 重写
                          // 可以与客户端通讯
                          handler(accept);
                      }
                  });
      }
  }

    // 编写一个handler方法，和客户端通讯
    public static void handler(Socket socket) {
        byte[] bytes = new byte[1024];
        // 通过socket 获取输入流
        InputStream inputStream = null;
        try {
            System.out.println("当前执行的线程：    " + Thread.currentThread().getName());
            inputStream = socket.getInputStream();
            // 循环的读取客户端发送的数据
            while (true) {
                int read = inputStream.read(bytes);
                if (read != -1) {
                    System.out.print(new String(bytes, 0, read)); // 输出客户端发送的数据
                } else {
                    break;
                }
            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
