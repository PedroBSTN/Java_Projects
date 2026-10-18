public class GeradorDeFrases {
        public static void main(String[] args) {
            String[] wordListOne = { "The fantastic", "my ordinary", "The best", "The fastier"};
            String[] wordListtwo = { "DOG","nerd", "cat", "horse", "program", "horse", "boy"};
            String[] wordListree = { "is strange", "is pretty", "is crazy", "is ugly"};

            int oneLeght = wordListOne.length;
            int twoLeght = wordListtwo.length;
            int treeLeght = wordListree.length;

            java.util.Random RG = new java.util.Random();
            int rand1 = RG.nextInt(oneLeght);
            int rand2 = RG.nextInt(twoLeght);
            int rand3 = RG.nextInt(treeLeght);

            String phrase = wordListOne[rand1] + " " + wordListtwo[rand2] + " " + wordListree[rand3];
            System.out.println("I hear about "+phrase);
        }
}