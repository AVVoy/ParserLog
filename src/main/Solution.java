package main;

import java.nio.file.Paths;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {

        LogParser logParser = new LogParser(Paths.get("D:\\example\\"));
        System.out.println(logParser.execute("get event for date = \"30.01.2014 12:56:22\""));


    }
}