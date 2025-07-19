class Solution {
    public String frequencySort(String s) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            int a=(int)s.charAt(i);
            int val=map.getOrDefault(a,0);
            map.put(a,++val);
        }
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        int index=0;
        for(Map.Entry<Integer,Integer> mp:map.entrySet()){
            list.add(new ArrayList<>(Arrays.asList(mp.getValue(),mp.getKey())));
        }
        list.sort((l1,l2)->l1.get(0).compareTo(l2.get(0)));
        StringBuilder str=new StringBuilder();
        for(int i=list.size()-1;i>=0;i--){
            int n=list.get(i).get(0);
           int m=list.get(i).get(1);
           char ch=(char)m;
            while(n!=0){
                str.append(ch);
                n--;
            }
        }
        return str.toString();
    }
}