package com.mycompany.exavoc;

import java.util.Scanner;

public class ExaVoc {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int o; //rt: guardado de respuesta temporalmente   o: opcion seleccionada
        int C1=0, H1=0, A1=0, S1=0, I1=0, D1=0, E1=0; //Intereses
        int  C2=0,H2=0, A2=0, S2=0, I2=0, D2=0, E2=0; //Aptitudes
        do{
            System.out.println("Bienvenido al Examen de aptitudes y habilidades.");
            System.out.println("");
            System.out.println("");
            System.out.println("Presione 1 para empezar");
            System.out.println("Presione 2 para salir.");
            o=leer.nextInt();
            switch(o){
            case 1:
                
                System.out.println("\n\n\n\n\n\n\n");
                int rt;
                System.out.println("¿Sabes qué es el PBI? "); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    C1=C1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Puedes establecer la diferencia conceptual entre macroeconomía y microeconomía?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    C1=C1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te gustaría realizar una investigación que contribuyera a hacer más justa la distribución de la riqueza? "); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    C1=C1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Si una gran empresa solicita un profesional como gerente de \n" +
                "comercialización, te sentirías a gusto desempeñando ese rol?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    C1=C1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te costearías tus estudios trabajando en una auditoría?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    C1=C1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Aceptarías trabajar escribiendo artículos en la sección económica de un \n" +
                "diario? "); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    C1=C1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("Dirigirías el área de importación y exportación de una empresa? "); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    C1=C1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Si te convocara tu club preferido para planificar, organizar y dirigir un \n" +
                "campo de deportes, aceptarías?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    C1=C1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿En un equipo de trabajo, preferís el rol de coordinador?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    C1=C1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println(" ¿Te resultaría gratificante ser asesor contable en una empresa reconocida?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    C1=C1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println(" ¿Organizas tu dinero de manera que te alcance hasta el próximo cobro? "); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    C2=C2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te resulta fácil coordinar un grupo de trabajo?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    C2=C2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te ofrecerías para organizar la despedida de soltero de uno de tus amigos?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    C2=C2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Distribuyes tus horarios del día adecuadamente para poder hacer todo lo \n" +
                "planeado?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    C2=C2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                //
                System.out.println("¿Te ofrecerías para explicar a tus compañeros un determinado tema que ellos \n" +
"no entendieron?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    H1=H1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te interesan los temas relacionados al pasado y a la evolución del hombre?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    H1=H1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te gratificaría el trabajar con niños?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    H1=H1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Pasarías varias horas leyendo algún libro de tu interés?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    H1=H1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Dedicarías parte de tu tiempo a ayudar a personas de zonas carenciadas?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    H1=H1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿La libertad y la justicia son valores fundamentales en tu vida?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    H1=H1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Participarías de una investigación sobre la violencia en el fútbol?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    H1=H1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Lucharías por una causa justa hasta las últimas consecuencias?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    H1=H1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Descubriste algún filósofo o escritor que haya expresado tus mismas ideas \n" +
"con antelación?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    H1=H1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Elegirías una carrera cuyo instrumento de trabajo fuere la utilización de un \n" +
"idioma extranjero?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    H1=H1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Preservar las raíces culturales de nuestro país, te parece importante y \n" +
"necesario?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    H2=H2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Consideras importante que desde la escuela primaria se fomente la actitud \n" +
"crítica y la participación activa?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    H2=H2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿En una discusión entre amigos, te ofreces como mediador?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    H2=H2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Eres de los que defiendes causas perdidas?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    H2=H2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                //
                System.out.println("¿Eres el que pone un toque de alegría en las fiestas?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    A1=A1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Tolerarías empezar tantas veces como fuere necesario hasta obtener el logro \n" +
"deseado?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    A1=A1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Cuando elegís tu ropa o decoras un ambiente, tienes en cuenta la \n" +
"combinación de los colores, las telas o el estilo de los muebles?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    A1=A1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Desearías que te regalen algún instrumento musical para tu cumpleaños?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    A1=A1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Disfrutas modelando con arcilla?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    A1=A1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te atrae armar rompecabezas o puzzles?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    A1=A1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te dedicarías a socorrer a personas accidentadas o atacadas por asaltantes?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    A1=A1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te gustaría dirigir un proyecto de urbanización en tu provincia?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    A1=A1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Harías el diseño de un afiche para una campaña contra el sida?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    A1=A1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Fuera de los horarios escolares, dedicas algún día de la semana a la \n" +
"realización de actividades corporales?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    A1=A1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println(" ¿Crees que los detalles son tan importantes como el todo?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    A2=A2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te gusta más el trabajo manual que el trabajo intelectual?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    A2=A2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Harías un nuevo diseño de una prenda pasada de moda, ante una reunión \n" +
"imprevista?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    A2=A2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Dirigirías un grupo de teatro independiente?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                    A2=A2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                //
                System.out.println(" ¿Participarías en una campaña de prevención contra la enfermedad de \n" +
"Chagas?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   S1=S1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Ante un llamado solidario, te ofrecerías para cuidar a un enfermo?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   S1=S1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te interesaría investigar sobre alguna nueva vacuna?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   S1=S1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Escuchas atentamente los problemas que te plantean tus amigos?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   S1=S1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Ante una emergencia epidémica participarías en una campaña brindando tu \n" +
"ayuda?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   S1=S1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Acostumbras a leer revistas relacionadas con los últimos avances científicos \n" +
"y tecnológicos en el área de la salud?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   S1=S1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te sentirías a gusto trabajando en un ámbito hospitalario?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   S1=S1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te agradaría hacer un curso de primeros auxilios?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   S1=S1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Convences fácilmente a otras personas sobre la validez de tus argumentos?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   S1=S1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te resultó interesante el estudio de las ciencias biológicas?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   S1=S1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Consideras que la salud pública debe ser prioritaria, gratuita y eficiente para \n" +
"todos?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   S2=S2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println(" ¿Estarías dispuesto a renunciar a un momento placentero para ofrecer tu \n" +
"servicio como profesional?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   S2=S2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Ayudas habitualmente a los no videntes a cruzar la calle?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   S2=S2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿A una frustración siempre opones un pensamiento positivo?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   S2=S2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                //
                System.out.println("¿Te gustaría investigar científicamente sobre cultivos agrícolas?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   I1=I1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Cuando eras chico, te interesaba saber cómo estaban construidos tus \n" +
"juguetes?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   I1=I1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Cuando tienes que resolver un problema matemático, perseveras hasta \n" +
"encontrar la solución?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   I1=I1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Cuando se descompone un artefacto en tu casa, te dispones prontamente a \n" +
"repararlo?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   I1=I1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Entablas una relación casi personal con tu computadora?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   I1=I1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println(" ¿Enviarías tu currículum a una empresa automotriz que solicita gerente para \n" +
"su área de producción?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   I1=I1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te incluirías en un proyecto nacional de desarrollo de la principal fuente de \n" +
"recursos de tu provincia?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   I1=I1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println(" ¿Harías un curso para aprender a fabricar los instrumentos y/o piezas de las \n" +
"máquinas o aparatos con que trabajas?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   I1=I1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te gustaría trabajar como profesional dirigiendo la construcción de una \n" +
"empresa hidroeléctrica?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   I1=I1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println(" ¿Planificas detalladamente tus trabajos antes de empezar?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   I2=I2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println(" ¿Crees que tus ideas son importantes, y haces todo lo posible para ponerlas \n" +
"en práctica?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   I2=I2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Trabajar con objetos te resulta más gratificante que trabajar con personas?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   I2=I2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Eres exigente y crítico con tu equipo de trabajo?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   I2=I2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                //
                System.out.println(" ¿Participarías en un grupo de defensa internacional dentro de alguna fuerza \n" +
"armada?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   D1=D1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Aceptarías que las mujeres formaran parte de las fuerzas armadas bajo las \n" +
"mismas normas que los hombres?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   D1=D1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println(" ¿Elegirías una profesión en la tuvieras que estar algunos meses alejado de tu \n" +
"familia, por ejemplo el marino?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   D1=D1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Estás de acuerdo con la formación de un cuerpo de soldados profesionales?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   D1=D1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te dedicarías a socorrer a personas accidentadas o atacadas por asaltantes?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   D1=D1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te gustaría realizar tareas auxiliares en una nave, como por ejemplo izado y \n" +
"arriado de velas, pintura y conservación del casco, arreglo de averías, \n" +
"conservación de motores, etc?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   D1=D1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Participarías como profesional en un espectáculo de acrobacia aérea?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   D1=D1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te interesan las actividades de mucha acción y de reacción rápida en \n" +
"situaciones imprevistas y de peligro?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   D1=D1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Aceptarías colaborar con el cumplimiento de las normas en lugares \n" +
"públicos?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   D1=D1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te gustaría participar para mantener el orden ante grandes desórdenes y \n" +
"cataclismos?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   D1=D1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Usar uniforme te hace sentir distinto, importante?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   D2=D2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Crees que un país debe poseer la más alta tecnología armamentista, a \n" +
"cualquier precio?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   D2=D2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Ante una situación de emergencia actúas rápidamente?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   D2=D2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Arriesgarías tu vida para salvar la vida de otro que no conoces?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   D2=D2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                //
                System.out.println("¿Visitarías un observatorio astronómico para conocer en acción el \n" +
"funcionamiento de los aparatos?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   E1=E1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te gustaría trabajar en un laboratorio mientras estudias?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   E1=E1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Sabrías responder que significa ADN y ARN?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   E1=E1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Estás informado sobre los nuevos descubrimientos que se están realizando \n" +
"sobre la Teoría del Big-Bang?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   E1=E1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te atrae investigar sobre los misterios del universo, por ejemplo los \n" +
"agujeros negros?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   E1=E1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te gustaría crear nuevas técnicas para descubrir las patologías de algunas \n" +
"enfermedades a través del microscopio?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   E1=E1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Aceptarías hacer una práctica rentada en una industria de productos \n" +
"alimenticios en el sector de control de calidad?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   E1=E1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te radicarías en una zona agrícola-ganadera para desarrollar tus actividades \n" +
"como profesional?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   E1=E1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te incluirías en un proyecto de investigación de los movimientos sísmicos y \n" +
"sus consecuencias?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   E1=E1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println(" ¿Formarías parte de un equipo de trabajo orientado a la preservación de la flora y la fauna en extinción?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   E1=E1+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿El trabajo individual te resulta más rápido y efectivo que el trabajo grupal?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   E2=E2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te interesan más los misterios de la naturaleza que los secretos de la \n" +
"tecnología?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   E2=E2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Te inhibís al entrar a un lugar nuevo con gente desconocida?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   E2=E2+1;
                }
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("¿Tenés interés por saber cuales son las causas que determinan ciertos \n" +
"fenómenos, aunque saberlo no altere tu vida?"); 
                System.out.println("1: Si ");
                System.out.println("2: No "); 
                rt=leer.nextInt(); 
                if(rt==1){
                   E2=E2+1;
                }
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                
                if(C1>H1 && C1>A1 && C1>S1 && C1>I1 && C1>D1 && C1>E1){
                    C1_Administrativas_Y_Contables();
                }else{
                   if(H1>C1 && H1>A1 && H1>S1 && H1>I1 && H1>D1 && H1>E1){
                       H1_Humanisticas_Y_Sociales();
                    }else{
                       if(A1>H1 && A1>C1 && A1>S1 && A1>I1 && A1>D1 && A1>E1){
                           A1_Artisticas();
                       }else{
                           if(S1>H1 && S1>A1 && S1>C1 && S1>I1 && S1>D1 && S1>E1){
                               S1_Medicina_Y_Cs_De_La_Salud();
                           }else{
                               if(I1>H1 && I1>A1 && I1>C1 && I1>S1 && I1>D1 && I1>E1){
                                   I1_Ingeniería_Y_Computacion();
                               }else{
                                  if(D1>H1 && D1>A1 && D1>C1 && D1>I1 && D1>S1 && D1>E1){
                                      D1_Defensa_Y_Seguridad();
                                  }else{
                                      if(E1>H1 && E1>A1 && E1>C1 && E1>I1 && E1>S1 && E1>D1){
                                          E1_Ciencias_Exactas_Y_Agrarias();
                                      }else{
                                          System.out.println("Empatados:\n\nPuntajes:\n\n");
                                          System.out.println("\nAdministrativas Y Contables:  "+C1+"\n");
                                          System.out.println("\nHumanidades Y Sociales:  "+H1+"\n");
                                          System.out.println("\nArtisticas:  "+A1+"\n");
                                          System.out.println("\nMedicina Y Cs De La Salud:  "+S1+"\n");
                                          System.out.println("\nIngenieria Y Computacion:  "+I1+"\n");
                                          System.out.println("\nDefensa Y SDeguridad:  "+D1+"\n");
                                          System.out.println("\nCiencias Exactas Y Agrarias:  "+E1+"\n");
                                          System.out.println("\n PRESIONA (1) PARA VER INFORMACION:  \n");
                                          do{
                                            rt=leer.nextInt();
                                          }while(rt==1);
                                          C1_Administrativas_Y_Contables();
                                          H1_Humanisticas_Y_Sociales();
                                          A1_Artisticas();
                                          S1_Medicina_Y_Cs_De_La_Salud();
                                          I1_Ingeniería_Y_Computacion();
                                          D1_Defensa_Y_Seguridad();
                                          E1_Ciencias_Exactas_Y_Agrarias();

                                      } 
                                  } 
                               }
                           }
                       }
                    } 
                }
                System.out.println("\n PRESIONA (1) PARA VER APTITUDES:  \n");
                do{
                  rt=leer.nextInt();
                }while(rt==1);
                
                if(C2>H2 && C2>A2 && C2>S2 && C2>I2 && C2>D2 && C2>E2){
                    C2_Administrativas_Y_Contables();
                }else{
                   if(H2>C2 && H2>A2 && H2>S2 && H2>I2 && H2>D2 && H2>E2){
                       H2_Humanisticas_Y_Sociales();
                    }else{
                       if(A2>H2 && A2>C2 && A2>S2 && A2>I2 && A2>D2 && A2>E2){
                           A2_Artisticas();
                       }else{
                           if(S2>H2 && S2>A2 && S2>C2 && S2>I2 && S2>D2 && S2>E2){
                               S2_Medicina_Y_Cs_De_La_Salud();
                           }else{
                               if(I2>H2 && I2>A2 && I2>C2 && I2>S2 && I2>D2 && I2>E2){
                                   I2_Ingeniería_Y_Computacion();
                               }else{
                                  if(D2>H2 && D2>A2 && D2>C2 && D2>I2 && D2>S2 && D2>E2){
                                      D2_Defensa_Y_Seguridad();
                                  }else{
                                      if(E2>H2 && E2>A2 && E2>C2 && E2>I2 && E2>S2 && E2>D2){
                                          E2_Ciencias_Exactas_Y_Agrarias();
                                      }else{
                                          System.out.println("Empatados:\n\nPuntajes:\n\n");
                                          System.out.println("\nAdministrativas Y Contables:  "+C2+"\n");
                                          System.out.println("\nHumanidades Y Sociales:  "+H2+"\n");
                                          System.out.println("\nArtisticas:  "+A2+"\n");
                                          System.out.println("\nMedicina Y Cs De La Salud:  "+S2+"\n");
                                          System.out.println("\nIngenieria Y Computacion:  "+I2+"\n");
                                          System.out.println("\nDefensa Y SDeguridad:  "+D2+"\n");
                                          System.out.println("\nCiencias Exactas Y Agrarias:  "+E2+"\n");
                                          System.out.println("\n PRESIONA (1) PARA VER INFORMACION:  \n");
                                          do{
                                              rt=leer.nextInt(); 
                                          }while(rt==1);
                                            C2_Administrativas_Y_Contables();
                                            H2_Humanisticas_Y_Sociales();
                                            A2_Artisticas();
                                            S2_Medicina_Y_Cs_De_La_Salud();
                                            I2_Ingeniería_Y_Computacion();
                                            D2_Defensa_Y_Seguridad();
                                            E2_Ciencias_Exactas_Y_Agrarias();
                                          
                                      }
                                  } 
                               }
                           }
                       }
                    } 
                }
                
            break;
            }
        }while(o!=1 && o!=2);
        
    }
    
    private static void C1_Administrativas_Y_Contables(){
        System.out.println("\n\nINTERES\n\nAdministrativas y Contables\n\n\n");
        System.out.println("Estas carreras parten de la matemática, tienen una relación muy estrecha y se encargan\n del área administrativa y la economía de las empresas con el fin de tener una estrategia financiera exitosa.\n" +
"\n" +
"Para poder decirse por una opción de este tipo, se debe comprender\n que es necesario realizar diversos cálculos. Una ventaja que se puede destacar,\n es que ofrecen una gran cantidad de opciones en el campo laboral.\n" +
"");
        System.out.println("\nIntereses representativos del area:\n\nOrganizativo\nSupervisión\nOrden\nAnalisis y sintesis\nColaboracion\nCalculo\nLiderazgo\nParticipacion activa\n\n");
    }
    private static void C2_Administrativas_Y_Contables(){
        System.out.println("\n\nAPTITUDES\n\nAdministrativas y Contables\n\n");
        System.out.println("Estas carreras parten de la matemática, tienen una relación muy estrecha y se encargan\n del área administrativa y la economía de las empresas con el fin de tener una estrategia financiera exitosa.\n" +
"\n" +
"Para poder decirse por una opción de este tipo, se debe comprender\n que es necesario realizar diversos cálculos. Una ventaja que se puede destacar,\n es que ofrecen una gran cantidad de opciones en el campo laboral.\n" +
"");
        System.out.println("\nAptitudes representativos del area:\n\nPersuasivo\nObjetivo\nPractico\nTolerante\nResponsable\nAmbicioso\nDinamico\nResolutivo\n\n");
    }
    private static void H1_Humanisticas_Y_Sociales(){
        System.out.println("\n\nINTERES\n\nHumanisticas y Sociales\n\n");
        System.out.println("Las Ciencias Sociales y Humanidades se encargan del estudio del ser humano como ente social, dando gran énfasis a aspectos \ncomo el comportamiento, interacciones humanas y la cultura.");
        System.out.println("\nIntereses representativos del area:\n\nPrecision Verbal\nOrganizacion\nRelacion de hechos\nLingüística\nOrden\nJusticia\nEl hombre analítico\n\n");
    }
    private static void H2_Humanisticas_Y_Sociales(){
        System.out.println("\n\nAPTITUDES\n\nHumanisticas y Sociales\n\n\n");
        System.out.println("Las Ciencias Sociales y Humanidades se encargan del estudio del ser humano como ente social, dando gran énfasis a aspectos /ncomo el comportamiento, interacciones humanas y la cultura.");
        System.out.println("\nAptitudes representativos del area:\n\nResponsable\nJusto\nConciliador\nPersuasivo\nSagaz\nImaginativo\nCompresivo\nEstabilidad emocional\n\n");
    }
    private static void A1_Artisticas(){
        System.out.println("\n\nINTERES\n\nArtisticas\n\n\n\n");
        System.out.println("La Carrera de Artes se dedica al estudio de la Teoría de las Artes,\n su historia y las diversas manifestaciones artísticas que de\n ella se desprenden, a través de reflexiones conceptuales y críticas.");
        System.out.println("\nIntereses representativos del area:\n\nEstetico\nArmonico\nManual\nVisual\nAuditivo\nObservacion y analisis\nSenso-Perceptivo\n\n");
    }
    private static void A2_Artisticas(){
        System.out.println("\n\nAPTITUDES\n\nArtisticas\n\n\n\n");
        System.out.println("La Carrera de Artes se dedica al estudio de la Teoría de las Artes,\n su historia y las diversas manifestaciones artísticas que de\n ella se desprenden, a través de reflexiones conceptuales y críticas.");
        System.out.println("\nAptitudes representativos del area:\n\nSensible\nImaginativo\nCreativo\nDetallista\nInnovador\nIntuitivo\nPaciente\nEspontaneo\n\n");
    }
    private static void S1_Medicina_Y_Cs_De_La_Salud(){
        System.out.println("\n\nINTERES\n\nMedicina y Cs. de la Salud\n\n\n\n");
        System.out.println("El concepto de Salud se contrapone al de enfermedad, y por tanto el primero es objeto de estudio\n para la Medicina y las Ciencias de la salud, que mediante la prevención y los hábitos de vida saludables,\n intentan incrementar la calidad de vida de la población.");
        System.out.println("\nIntereses representativos del area:\n\nAsistir\nInvestigativo\nPrecision\nSenso Perceptivo\nAnalitico\nAyudar\nCurar\nRehabilitar\n\n");
    }
    private static void S2_Medicina_Y_Cs_De_La_Salud(){
        System.out.println("\n\nAPTITUDES\n\nMedicina y Cs. de la Salud\n\n\n\n");
        System.out.println("El concepto de Salud se contrapone al de enfermedad, y por tanto el primero es objeto de estudio\n para la Medicina y las Ciencias de la salud, que mediante la prevención y los hábitos de vida saludables,\n intentan incrementar la calidad de vida de la población.");
        System.out.println("\nAptitudes representativos del area:\n\nAltruista\nSolidario\n´Paciente\nComprensivo\nRespetuoso\nPersuasivo\nServicial\nObservador\n\n");
    }
    private static void I1_Ingeniería_Y_Computacion(){
        System.out.println("\n\nINTERES\n\nIngenieria y Computacion\n\n\n\n");
        System.out.println("Es una rama de la ingeniería que se basa en la capacidad para diseñar, producir, operar y dar soporte a diferentes sistemas.");
        System.out.println("\nIntereses representativos del area:\n\nCalculo\nCientifico\nManual\nExacto\nPlanificar\nOrganizar\nControlar\n\n");
    }
    private static void I2_Ingeniería_Y_Computacion(){
        System.out.println("\n\nAPTITUDES\n\nIngenieria y Computacion\n\n\n\n");
        System.out.println("Es una rama de la ingeniería que se basa en la capacidad para diseñar, producir, operar y dar soporte a diferentes sistemas.");
        System.out.println("\nAptitudes representativos del area:\n\nPreciso\n´Practico\nCritico\nAnalitico\nRigido\nRacional\nIdependiente\n\n");
    }
    private static void D1_Defensa_Y_Seguridad(){
        System.out.println("\n\nINTERES\n\nDefensa y Seguridad\n\n\n");
        System.out.println("Consiste en formar profesionales para asumir roles de asesoramiento,\n planificación, dirección y ejecución de tareas dirigidas a la seguridad\n pública o privada y a la defensa civil.");
        System.out.println("\nIntereses representativos del area:\n\nJusticia\nEquidad\nColaboracion\nEspiritu de equipo\nLiderazgo\nCoordinacion\nDestreza fisica\n\n");
    }
    private static void D2_Defensa_Y_Seguridad(){
        System.out.println("\n\nAPTITUDES\n\nDefensa y Seguridad\n\n\n");
        System.out.println("Consiste en formar profesionales para asumir roles de asesoramiento,\n planificación, dirección y ejecución de tareas dirigidas a la seguridad\n pública o privada y a la defensa civil.");
        System.out.println("\nAptitudes representativos del area:\n\nArriesgado\nSolidario\nValiente\nAgresivo\nPersuasivo\nAventurero\nEquilibrio psiquico\n\n");
    }
    private static void E1_Ciencias_Exactas_Y_Agrarias(){
        System.out.println("\n\nINTERES\n\nCiencias Exactas y Agrarias\n\n\n");
        System.out.println("La ciencia agrícola o ciencias agrarias es un amplio campo multidisciplinario\n de biología que abarca las partes de las ciencias exactas, naturales, económicas y sociales que se\n utilizan en la práctica y la comprensión de la agricultura.");
        System.out.println("\nIntereses representativos del area:\n\nInvestigacion\nOrden\nOrganizacion\nAnalisis y sintesis\nNumerico\nClasificar\nPrecision\nExacto\n\n");
    }
    private static void E2_Ciencias_Exactas_Y_Agrarias(){
        System.out.println("\n\nAPTITUDES\n\nCiencias Exactas y Agrarias\n\n\n");
        System.out.println("La ciencia agrícola o ciencias agrarias es un amplio campo multidisciplinario\n de biología que abarca las partes de las ciencias exactas, naturales, económicas y sociales que se\n utilizan en la práctica y la comprensión de la agricultura.");
        System.out.println("\nAptitudes representativos del area:\n\nMetodico\nAnalitico\nObservador\nIntrovertido\nPaciente\nSeguro\nIdependiente\nIntuitivo\n\n");
        
    }
}
