package day20;

import java.util.Scanner;

/**
 * @ClassName StringNull
 * @Description TODO
 * @Auther danni
 * @Date 2019/8/6 0:42]
 * @Version 1.0
 **/

public class StringNull {
    public static void main(String[] args) {
        boolean first=true;
        boolean last=false;
        boolean mid=false;
        System.out.println("请输入要处理的字符串");
       Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        char[] arr=s.toCharArray();
        s="";
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]=='*'&& first){
                continue;
            }else if(arr[i]!='*'&&(!mid)){
                first=false;
                s+=arr[i];
            }else if(arr[i]=='*'&&(!first)){
                s+=arr[i];
                mid=true;
                first=true;
            }else if(arr[i]=='*'&&mid){
                continue;
            }else if(arr[i]!='*'&&(mid)){
                last=true;
                s+=arr[i];
            }else if(arr[i]=='*'&&last){
                break;
            }
        }
        System.out.printf("%s",s);
    }
}
