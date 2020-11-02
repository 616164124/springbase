/**
 * projectName: springbase fileName: BasicBuffer.java packageName: com.demo.nio date: 2020-09-27
 * copyright(c) 2017-2020 xxx公司
 */
package com.demo.nio;

import java.nio.IntBuffer;

/**
 * @version: V1.0
 * @author: mikael
 * @className: BasicBuffer
 * @packageName: com.demo.nio
 * @description:
 * @data: 2020-09-27
 */
public class BasicBuffer {

  public static void main(String[] args) {

    // 创建一个buffer,大小为5，即可以存放5个int
    IntBuffer intBuffer = IntBuffer.allocate(5);
    // 向intBuffer中存放数据
    /*intBuffer.put(10);
    intBuffer.put(20);
    intBuffer.put(30);
    intBuffer.put(40);
    intBuffer.put(50);
    */
    for (int i = 0; i < intBuffer.capacity(); i++) {
      intBuffer.put(i * 2);
    }
    // 获取buffer中的数据
    // buffer数据转换，读写切换
    intBuffer.flip();
    while (intBuffer.hasRemaining()) {
      System.out.println(intBuffer.get());
    }
  }
}
