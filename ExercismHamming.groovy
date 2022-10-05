class Hamming {

    def distance(strand1, strand2) {
        Integer i = 0;
        Integer count = 0;
        if(strand1 != null && strand2 != null){
            if(strand1.length() == strand2.length()){
                for(i = 0; i < strand1.length(); i++){
                    if(strand1[i] != strand2[i]){
                        count++;
                    }
                }
            }else{
                throw new ArithmeticException();
            }
        }
        count
    }
}