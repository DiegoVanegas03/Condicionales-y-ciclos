public class Calculadora{
    public static void main(String[] args)
    {
        int i;
        for (i=0; i< args.length; i+=3)
        {
           switch (args[i])
           {
               case "SUMA" -> System.out.println((args[i+1]) + "+" + (args[i+2]) + "=" + (Integer.parseInt(args[i+1]) + (Integer.parseInt((args[i+2]))) ));

               case "RESTA" -> System.out.println((args[i+1]) + "-" + (args[i+2]) + "=" + (Integer.parseInt(args[i+1]) - (Integer.parseInt((args[i+2]))) ));

               case "MULTIPLICACION" -> System.out.println((args[i+1]) + "*" + (args[i+2]) + "=" + (Integer.parseInt(args[i+1]) * (Integer.parseInt((args[i+2]))) ));

               case "DIVISION"-> System.out.println((args[i+1]) + "/" + (args[i+2]) + "=" + (Integer.parseInt(args[i+1]) / (Integer.parseInt((args[i+2]))) ));
           }
        }
    }
}
