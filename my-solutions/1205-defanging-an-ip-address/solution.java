class Solution {
    public String defangIPaddr(String address) {
        StringBuilder defangedIP = new StringBuilder();
        for (char ch : address.toCharArray()) {
            if (ch == '.') {
                defangedIP.append("[.]");
            } else {
                defangedIP.append(ch);
            }
        }
        return defangedIP.toString();
    }
}
