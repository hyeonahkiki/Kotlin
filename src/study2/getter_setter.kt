package study2

class Human2
{
    var age:Int = 0
        // age 포로퍼티의 getter
        get(){
        return field // field를 특수식별자(프로퍼티 속의 변수를 나타내는 식별자)
    }
        // age 프로퍼티의 setter
        set(value)
        //value는 저장하려는 값. age의 프로퍼티의 타입과 일치하기 때문에
        //타입을 생략해도 됨
        {
            // field 실제로 프로퍼티 속에 저장된 식별자
            field = if(value>=0) value else 0
        }

    // val 프로퍼티는 getter만 존재한다.
    //Getter와 Setter를 별도로 지정하지 않으면 다음과 같이 자동으로 지정된다.
    var id:Int = 0
        // 지정하지 않을 경우 자동으로 생성되는 코드
        // 디폴트 Getter / Setter
        // 커스터 마이징을 할 때는 별도로 정의 해주면 된다.
//        get(){
//            return field
//        }
//        set(value){
//            field = value
//        }

    // 이유는 val로 셋팅된 값은 바꿀 수 없기 때문에
}