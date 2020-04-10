package study4

import java.lang.NullPointerException
import java.lang.NumberFormatException

/*
 예외처리 구문
 try{
    // 실행코드
 }catch(e: Exception){
    // 예외시 처리할 코드
 }final{
    // 예외가 발생해도 꼭 동작해야하는 것(반드시실행)
    // finally 동작
 }

 예외 처리 변수에 적용
 var result = try{
    // 실행 코드
 }catch(e:Exception){
    // 예외시 처리코드
 }

 catch 블록은 여러개의 예외 객체가 발생해서 각각 다른 동작으로
  처리해야한다면 사용할 수 있다
  */

fun main(args:Array<String>):Unit{
    try{
        // 예외상황이 발생될 수 있는 코드
        val str="hello"
        val num = str.toInt()
        println(num)
        // 예외사황 발생 시 실행할 코드
    }catch(e:NumberFormatException){
        println("문자열을 숫자로 변환할 수 없습니다!!")
    // catch 구문을 더 넣을 수 있다. 여러개를 두어 사용가능
    }catch(e:NullPointerException){
        println("배열의 인덱스 범위를 초과했습니다!")
    } finally {
        // 반드시 실행되는 코드
        println("반드시 실행되는 부분입니다.")
    }

}
