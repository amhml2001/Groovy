class EstudosGroovy{
    static void main(String[] args){
        println("1) Hello World!");
        def age = "Dog";//def permite que a variável receba valores de tipos diferentes
        age = 21;//Podemos declarar uma variável com um tipo específico. Ex: String aaa = "aaa"

        //INTEGER OPERATIONS
        println("2) " + age);
        println("3) 5 + 4 = " + (5 + 4));
        println("4) 5 - 4 = " + (5 - 4));
        println("5) 5 * 4 = " + (5 * 4));
        println("6) 5 / 4 = " + (5.intdiv(4)));
        println("7) 5 % 4 = " + (5 % 4));
        //FLOAT OPERATIONS
        println("8) 5.2 + 4.4 = " + (5.2.plus(4.4)));
        println("9) 5.2 - 4.4 = " + (5.2.minus(4.4)));
        println("10) 5.2 * 4.4 = " + (5.2.multiply(4.4)));
        println("11) 5.2 / 4.4 = " + (5.2 / 4.4));
        //MATH PRIORITY
        println("12) 3 + 2 * 5 = " + (3 + 2 * 5));
        println("13) (3 + 2) * 5 = " + ((3 + 2) * 5));
        //INCREMENT & DECREMENT
        //Before makes it add/subtract and then print the value. After you print the value and then add/subtract
        println("14) age++ = " + (age++));
        println("15) ++age = " + (++age));
        println("16) age-- = " + (age--));
        println("17) --age = " + (--age));
        //MAX MIN VALUES FOR TYPE
        println("18) Biggest Int is " + java.lang.Integer.MAX_VALUE);
        println("19) Smallest Int is " + java.lang.Integer.MIN_VALUE);
        println("20) Biggest Float is " + java.lang.Float.MAX_VALUE);
        println("21) Smallest Float is " + java.lang.Float.MIN_VALUE);
        println("20) Biggest Double is " + java.lang.Double.MAX_VALUE);
        println("21) Smallest Double is " + java.lang.Double.MIN_VALUE);
        // GROOVY DECIMAL ACCURACY
        println("22) 1.10000000111111111111 + 1.1000000011111111111111" + (1.1000000011111111111111111111 + 1.100000001111111111111111111));
        //SOME OPERATIONS IN GROOVY
        def randNum = 2.0;
        println("23) Math.abs(-2.45) = " + (Math.abs(-2.45)));
        println("24) Math.round(-2.45) = " + (Math.round(2.45)));
        println("25) randNum.pow(3) = " + (randNum.pow(3)));
        println("26) 3.0.equals(2.0) = " + (3.0.equals(2.0)));
        println("27) randNum.equals(Float.NaN) = " + (randNum.equals(Float.NaN)));
        println("28) Math.sqrt(9) = " + (Math.sqrt(9)));//Raiz quadrada
        println("29) Math.cbrt(9) = " + (Math.cbrt(27)));//Raiz cúbica
        println("30) Math.ceil(2.45) = " + (Math.ceil(2.45)));//arredonda pra cima
        println("31) Math.floor(2.45) = " + (Math.floor(2.45)));//arredonda pra baixo
        println("32) Math.min(2, 3, 4) = " + (Math.min(2.45)));//Menor valor da lista
        println("33) Math.max(2, 3, 4) = " + (Math.max(2.45)));//Maior valor da lista
        println("34) Math.log(2) = " + (Math.log(2)));//Log de 2
        println("35) Math.log10(2) = " + (Math.log10(2)));
        println("36) Math.toDegrees(Math.PI) = " + (Math.toDegrees(Math.PI)));//Converte para graus
        println("37) Math.toRadians(90) = " + (Math.toRadians(90))); //Converte para radianos
        println("38) Math.sin(0.5 * Math.PI) = " + (Math.sin(0.5 * Math.PI)));//sin, cos, tan, asin, acos, atan, sinh, cosh, tanh
        println("39) Math.abs(new Random().nextInt() % 100) + 1 = " + (Math.abs(new Random().nextInt() % 100) + 1))//valores entre 1 e 100
        //STRINGS
        def name = "Amanda";
        println('40) I am ${name}\n');//diferença entre aspas simples
        println("41) I am ${name}\n");//e duplas nos prints quando tem variáveis
        def multString = '''I am
        a String 
        that goes on 
        for many lines''';
        println("42) " + multString);
        println("43) 3rd Index of Name = " + name[3]);
        println("44) Index of d = " + name.indexOf('d'));
        println("45) 1st 3 characters of name = " + name[0..2]);
        println("46) Every other character = " + name[0,4,5]);
        println("47) Substring at 1 = " + name.substring(1));
        println("48) Substring at 1 to 4 = " + name.substring(1,4));
        println("49) My name is " + name);
        println("50) My name is ".concat(name));
        println("60) " + "What I said is " * 2);
        println("61) Amanda == Amanda --> " + ('Amanda'.equals('Amanda')));
        println("62) Amanda == amanda --> " + ('Amanda'.equalsIgnoreCase('amanda')));
        println("63) Length = " + name.length());
        def repeatStr = 'What is this magic' * 2;
        println("64) " + repeatStr - "What");
        println("65) " + repeatStr.split(' '));
        println("66) " + repeatStr.toList());
        println("67) " + repeatStr.replaceAll('I', 'she'))
        println("68) Uppercase --> " + name.toUpperCase());
        println("69) Lowercase --> " + name.toLowerCase());
        println("70) Ant <=> Banana --> " + ('Ant' <=> 'Banana'));//Retorna -1 se a primeira string vem primeiro(alfabético)
        println("70) Banana <=> Ant --> " + ('Banana' <=> 'Ant'));//Rteorna 1 se a segunda string vem primeiro(alfabético)
        println("70) Banana <=> Banana --> " + ('Banana' <=> 'Banana'));//Retorna 0 se as strings forem iguais
        def randString = "Random";
        println("71) A ${randString} String");
        printf("72) A %s String \n", randString);
        printf("73) %-10s %d %.2f %10s \n", ['Stuff', 10, 1.2345, 'Random'])//10 e -10 são padding(espaços) na string
        print("74) What's your name? ");
        def fName = System.console().readLine();//pode dar erro dependendo de como testar
        println("Hello " + fName);
        print("75) Enter a number: ")
        def num1 = System.console().readLine().toDouble();//a resposta do console é uma string, então precisa converter
        rint("Enter a number: ")
        def num2 = System.console().readLine().toDouble();
        printf("%.2f + %.2f = %.2f\n", [num1, num2, (num1 + num2)]);
        //LIST
        def primes = [2, 3, 5, 7, 11, 13];
        println("76) 2nd Prime = " + primes[1]);
        println("77) 3rd Prime = " + primes.get(2));
        def employee = ['Amanda', 21, 1.50, [1, 2, 3]];
        println("78) 2nd Number = " + employee[3][1]);//2nd numero da lista dentro de employees
        println("79) Length = " + primes.size());
        primes.add(17);
        primes<<19;
        primes.add(23);
        primes + [29, 31];
        primes - [31];
        println("80) Is Empty? " + primes.isEmpty());
        println("81) 1 to 3 --> " + primes[0..2]);
        println("82) " + primes);
        println("Matches --> " + primes.intersect([2, 3, 7]));
        println("Reverse --> " + primes.reverse());
        println("Sort --> " + primes.sort());
        println("Last --> " + primes.pop());
    }
}