public class Schaakbord {
    Schaakstuk[][] bord = new Schaakstuk[8][8];
    String[][] legenda = new String[8][8];

    public void maakNieuwBordOp(){
        bord[0][0] = new Schaakstuk("w Toren   ", "wit");
        bord[0][1] = new Schaakstuk("w Paard   ", "wit");
        bord[0][2] = new Schaakstuk("w Loper   ", "wit");
        bord[0][3] = new Schaakstuk("w Koningin", "wit");
        bord[0][4] = new Schaakstuk("w Koning  ", "wit");
        bord[0][5] = new Schaakstuk("w Loper   ", "wit");
        bord[0][6] = new Schaakstuk("w Paard   ", "wit");
        bord[0][7] = new Schaakstuk("w Toren   ", "wit");

        bord[1][0] = new Schaakstuk("w Pion    ", "wit");
        bord[1][1] = new Schaakstuk("w Pion    ", "wit");
        bord[1][2] = new Schaakstuk("w Pion    ", "wit");
        bord[1][3] = new Schaakstuk("w Pion    ", "wit");
        bord[1][4] = new Schaakstuk("w Pion    ", "wit");
        bord[1][5] = new Schaakstuk("w Pion    ", "wit");
        bord[1][6] = new Schaakstuk("w Pion    ", "wit");
        bord[1][7] = new Schaakstuk("w Pion    ", "wit");

        bord[7][0] = new Schaakstuk("z Toren   ", "zwart");
        bord[7][1] = new Schaakstuk("z Paard   ", "zwart");
        bord[7][2] = new Schaakstuk("z Loper   ", "zwart");
        bord[7][3] = new Schaakstuk("z Koningin", "zwart");
        bord[7][4] = new Schaakstuk("z Koning  ", "zwart");
        bord[7][5] = new Schaakstuk("z Loper   ", "zwart");
        bord[7][6] = new Schaakstuk("z Paard   ", "zwart");
        bord[7][7] = new Schaakstuk("z Toren   ", "zwart");

        bord[6][0] = new Schaakstuk("z Pion    ", "zwart");
        bord[6][1] = new Schaakstuk("z Pion    ", "zwart");
        bord[6][2] = new Schaakstuk("z Pion    ", "zwart");
        bord[6][3] = new Schaakstuk("z Pion    ", "zwart");
        bord[6][4] = new Schaakstuk("z Pion    ", "zwart");
        bord[6][5] = new Schaakstuk("z Pion    ", "zwart");
        bord[6][6] = new Schaakstuk("z Pion    ", "zwart");
        bord[6][7] = new Schaakstuk("z Pion    ", "zwart");
    }
    public void maakLegenda() {
        legenda[7][0] = "A8";
        legenda[7][1] = "B8";
        legenda[7][2] = "C8";
        legenda[7][3] = "D8";
        legenda[7][4] = "E8";
        legenda[7][5] = "F8";
        legenda[7][6] = "G8";
        legenda[7][7] = "H8";
        legenda[6][0] = "A7";
        legenda[6][1] = "B7";
        legenda[6][2] = "C7";
        legenda[6][3] = "D7";
        legenda[6][4] = "E7";
        legenda[6][5] = "F7";
        legenda[6][6] = "G7";
        legenda[6][7] = "H7";
        legenda[5][0] = "A6";
        legenda[5][1] = "B6";
        legenda[5][2] = "C6";
        legenda[5][3] = "D6";
        legenda[5][4] = "E6";
        legenda[5][5] = "F6";
        legenda[5][6] = "G6";
        legenda[5][7] = "H6";
        legenda[4][0] = "A5";
        legenda[4][1] = "B5";
        legenda[4][2] = "C5";
        legenda[4][3] = "D5";
        legenda[4][4] = "E5";
        legenda[4][5] = "F5";
        legenda[4][6] = "G5";
        legenda[4][7] = "H5";
        legenda[3][0] = "A4";
        legenda[3][1] = "B4";
        legenda[3][2] = "C4";
        legenda[3][3] = "D4";
        legenda[3][4] = "E4";
        legenda[3][5] = "F4";
        legenda[3][6] = "G4";
        legenda[3][7] = "H4";
        legenda[2][0] = "A3";
        legenda[2][1] = "B3";
        legenda[2][2] = "C3";
        legenda[2][3] = "D3";
        legenda[2][4] = "E3";
        legenda[2][5] = "F3";
        legenda[2][6] = "G3";
        legenda[2][7] = "H3";
        legenda[1][0] = "A2";
        legenda[1][1] = "B2";
        legenda[1][2] = "C2";
        legenda[1][3] = "D2";
        legenda[1][4] = "E2";
        legenda[1][5] = "F2";
        legenda[1][6] = "G2";
        legenda[1][7] = "H2";
        legenda[0][0] = "A1";
        legenda[0][1] = "B1";
        legenda[0][2] = "C1";
        legenda[0][3] = "D1";
        legenda[0][4] = "E1";
        legenda[0][5] = "F1";
        legenda[0][6] = "G1";
        legenda[0][7] = "H1";
    }


    public void printSchaakbord(){
        for(int i = 0; i < legenda.length; i++){
            for(int j = 0; j < legenda.length; j++){
                if(legenda[i][j].contains("H")){
                    if(bord[i][j] != null){
                        System.out.println(legenda[i][j] + ": " + bord[i][j].naam + "  ");
                    }
                    else{
                        System.out.println(legenda[i][j] + ": " + "leeg       ");

                    }
                }
                else{
                    if(bord[i][j] != null){
                        System.out.print(legenda[i][j] + ": " + bord[i][j].naam + " | ");
                    }
                    else{
                        System.out.print(legenda[i][j] + ": " + "leeg       | ");
                    }
                }
            }
        }
    }

    public int[] getArrayPosities(String code) {
        int[] positie = new int[2] ;

        for (int i = 0; i < legenda.length; i++) {
            for (int j = 0; j < legenda.length; j++) {
                if(code == legenda[i][j]){
                    positie[0] = i;
                    positie[2] = j;
                    return positie;
                }

            }
        }
        return positie;
    }

    public void doeZet(String vanCode, String naarCode){
        Schaakstuk schaakstuk = null;
        for(int i = 0; i < legenda.length ;i++){
            for(int j = 0; j < legenda.length; j++){
                if(legenda[i][j].equalsIgnoreCase(vanCode)){
                    schaakstuk = bord[i][j];
                    bord[i][j] = null;

                }
            }
        }
        for(int i = 0; i < legenda.length ;i++){
            for(int j = 0; j < legenda.length; j++){
                if(legenda[i][j].equalsIgnoreCase(naarCode)){
                    bord[i][j] = schaakstuk;

                }
            }
        }
    }

    public Schaakbord() {
        maakNieuwBordOp();
        maakLegenda();
        printSchaakbord();
    }
}

