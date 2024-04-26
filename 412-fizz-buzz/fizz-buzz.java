class Solution {
    public List<String> fizzBuzz(int n) {
        
        List<String> answer = new ArrayList<>(n);

        for(int i = 1; i <= n; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            
            StringBuilder currStr = new StringBuilder("");
        
            if(divisibleBy3) {
               currStr.append("Fizz");
            }
            
            if(divisibleBy5) {
                currStr.append("Buzz");
            } 
            
            if(currStr.isEmpty()){
                currStr.append(Integer.toString(i));
            }

            answer.add(currStr.toString());
        }
        return answer;
    }
}