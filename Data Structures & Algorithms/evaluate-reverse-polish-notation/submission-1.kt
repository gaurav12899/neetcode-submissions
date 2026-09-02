class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        var st  = Stack<Int>()
        for(i in tokens){
            if(isOperator(i)){
                var second = st.pop()
                var first = st.pop()
                var result = operation(first,second,i)
                st.push(result)
            }else{
                st.push(i.toInt())
            }
        }
        return st.pop()

    }
    fun isOperator(s:String)= s=="+" || s=="-" || s=="*" || s=="/"
    fun operation(first:Int,second:Int, oper:String):Int{
        return when(oper){
            "+"->first+second
            "-"->first-second
            "*"->first*second
            "/"->first/second
            else->-1
        }
    }
}
