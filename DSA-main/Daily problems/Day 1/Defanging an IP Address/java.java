class Solution {
    public String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        for(char ch: address.toCharArray()) {
            if(ch == '.') {
                str.append("[.]");
            } else {
                str.append(ch);
            }
        }
        return str.toString();
    }
}