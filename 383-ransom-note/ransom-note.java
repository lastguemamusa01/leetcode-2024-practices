class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineLetters = new HashMap<>();

        for(int i = 0; i < magazine.length(); i++) {
            char m = magazine.charAt(i);

            int currentCount = magazineLetters.getOrDefault(m, 0);
            magazineLetters.put(m, currentCount+1);
        }

        for(int j = 0; j <ransomNote.length(); j++) {
            char r = ransomNote.charAt(j);

            int currentCount = magazineLetters.getOrDefault(r, 0);

            if(currentCount == 0) {
                return false;
            }
            magazineLetters.put(r, currentCount - 1);
        }

        return true;

    }

    // TC - O - m
    // SC - O - k(26 lower case letters) but there is litter number son this will be constant -> 1
}