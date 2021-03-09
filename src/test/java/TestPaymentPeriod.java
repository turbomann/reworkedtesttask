//package test;
//
//import net.bytebuddy.dynamic.scaffold.MethodRegistry;
//
//import java.text.DecimalFormat;
//import java.text.DecimalFormatSymbols;
//import java.time.LocalDate;
//import java.time.Month;
//import java.time.format.DateTimeFormatter;
//import java.util.Locale;
//
//public class TestPaymentPeriod {
//    public static void main(String[] args) {
//
//        // How to calculate credit
//        //String date = "2021-02-16";
//        String date = "2020-12-01 10:48:33.0";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern ("yyyy-MM-dd");
//        LocalDate localDate = LocalDate.parse(date, formatter);
////        System.out.println(formatter.parse(date));
//
//
//        int neededCreditSum = 300000; //CLIENT_SIDE
//        double commonSum; // CALCULATE
//        double annuityPayment; // CALCULATE
//        double coefficientAnnuityPayment; //CALCULATE
//        double percentageRate = 15; // BANK_SIDE
//        int creditPeriod = 18; //CLIENT_SIDE
//        double monthCreditRate; //CALCULATE
//
//
//        DecimalFormat round = new DecimalFormat("#.####",new DecimalFormatSymbols(Locale.ENGLISH));
//        DecimalFormat roundPayment = new DecimalFormat("#.##",new DecimalFormatSymbols(Locale.ENGLISH));
//
//        monthCreditRate = (percentageRate / 100) / 12;
//        System.out.println("Calculate percent rate by Month");
//        System.out.println(round.format(monthCreditRate));
//
//
//        System.out.println("Calculate coefficient annuity payment");
//        coefficientAnnuityPayment = monthCreditRate * (Math.pow((1 + monthCreditRate),creditPeriod))
//                /((Math.pow((1 + monthCreditRate),creditPeriod))-1);
//        System.out.println(round.format(coefficientAnnuityPayment));
//
//        System.out.println("Calculate annuity payment");
//        annuityPayment = neededCreditSum * coefficientAnnuityPayment;
//        System.out.println(roundPayment.format(annuityPayment));
//
//        System.out.println("Calculate percent");
//        double percent = (neededCreditSum * (percentageRate/100) * 30) / 365;
//
//        System.out.println(roundPayment.format(percent));
//
//
//        commonSum = annuityPayment * creditPeriod;
//        System.out.println("Payment plan");
//        System.out.println("Number of payment "+" Date of payment "+ " | " + "Repayment of principal" + " | " +
//                " Percent repayment " + " | " + "Balance");
//        for (int i = 1, b = 30; i <= creditPeriod ; i++, b += 30) {
//            System.out.println(i + " | " + roundPayment.format(annuityPayment) + " | " + localDate.plusDays(b) + " | " +
//                    (roundPayment.format(annuityPayment - percent)) + " | " +
//                    roundPayment.format(percent) + " | " + (roundPayment.format(commonSum -= annuityPayment)));
//        }
//    }
//}
