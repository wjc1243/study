package com.example.study.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.PriorityQueue;

public class NioTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("C:\\Users\\wjc\\Desktop\\公司.txt", "rw");
        FileChannel channel = file.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(10240);

        int byteReads = channel.read(buffer);
        while (byteReads != -1){
            System.out.println("read :" + byteReads);
            buffer.flip();
            while (buffer.hasRemaining()){
                System.out.println(Charset.forName("utf-8").decode(buffer).toString());
            }
            buffer.clear();
            byteReads = channel.read(buffer);
        }
        file.close();
    }
}
