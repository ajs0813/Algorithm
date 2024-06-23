class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String[] str = Integer.toString(age).split("");
        String answer = "";

        for(String s : str){
            if(s.equals("0")){
                sb.append("a");
            }
            if(s.equals("1")){
                sb.append("b");
            }
            if(s.equals("2")){
                sb.append("c");
            }
            if(s.equals("3")){
                sb.append("d");
            }
            if(s.equals("4")){
                sb.append("e");
            }
            if(s.equals("5")){
                sb.append("f");
            }
            if(s.equals("6")){
                sb.append("g");
            }
            if(s.equals("7")){
                sb.append("h");
            }
            if(s.equals("8")){
                sb.append("i");
            }
            if(s.equals("9")){
                sb.append("j");
            }
        }

        answer = sb.toString();

        return answer;
    }
}