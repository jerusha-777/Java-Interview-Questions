class arrtranspose{
    public static void main(String[] args){
        int original[][] = {{1,2,3},{2,4,5},{5,6,8}};
        int transpose[][] = new int[3][3];
        
        System.out.println("Matrix before transpose");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(original[i][j]+ " ");
            }
            System.out.println();
            
        }
        System.out.println("Matrix before transpose");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(original[j][i]+ " ");
            }
            System.out.println();
            
        }
    
}
}
