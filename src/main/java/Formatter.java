public class Formatter {
    public String correctCost(Double cost) {
        int remainder = ((int)(Math.floor(cost) % 10));
        String formattedCost;

        if ((cost * 10) - (int)(cost * 10) == 0) {
            formattedCost = cost + "0";
        } else {
            formattedCost = cost.toString();
        }

        if ((cost > 10 && cost < 15) || remainder == 0 || (remainder > 4 && remainder < 10)) {
            formattedCost += " рублей";
        } else if (remainder == 1) {
            formattedCost += " рубль";
        } else if (remainder > 1 && remainder < 5) {
            formattedCost += " рубля";
        }
        return formattedCost;
    }

    public Double formatDouble(Double doubleToFormat) {
        String strToDouble = String.format("%.2f", doubleToFormat).replace(",", ".");
        return Double.valueOf(strToDouble);
    }
}
