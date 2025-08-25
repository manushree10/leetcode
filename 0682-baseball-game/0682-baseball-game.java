class Solution {
    public int calPoints(String[] operations) {
        int n=0;
        int index=-1;
        List<Integer>list=new ArrayList();
        for(int i=0;i<operations.length;i++){
            index = list.size()-1;
            if((operations[i]).matches("-?\\d+")){
                 n= Integer.parseInt(operations[i]);
                 list.add(n);
            }
            if(operations[i].equals("+"))
                 list.add(list.get(index)+list.get(index-1));
            if(operations[i].equals("D"))
                 list.add(list.get(index)*2);
            if(operations[i].equals("C"))
                list.remove(index);
         
        }
        int total=0;
            for(int i:list)
                total+=i;
        return total;
    }
}