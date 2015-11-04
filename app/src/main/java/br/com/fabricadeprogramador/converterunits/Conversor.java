package br.com.fabricadeprogramador.converterunits;

/**
 * Created by barbarapurkottcezar on 03/11/15.
 */
public class Conversor {

    public static double metrosParaMilhasNaut (Double metros){
        Double MilhasNaut = metros / 1852;

        return MilhasNaut;
    }

    public static double metrosParaMilhasTerres (Double metros){
        Double MilhasTerres = metros / 1609.3;

        return MilhasTerres;
    }

    public static double metrosParaKM (Double metros){
        Double MilhasKM = metros / 1000;

        return MilhasKM;
    }

}
