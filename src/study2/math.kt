// 다른 패키지 있는 파일명과 같아도 괜찮음 , 함수명이 같아도 괜찮음
// package선언문 : 이 소스파일이 study2 패키지 안에 있음을 의미
package study2

fun max(a:Int, b:Int):Int = if (a > b) a else b

fun min(a:Int, b:Int):Int = if (a < b) a else b

fun abs(num:Int):Int = if (num >= 0) num else -num