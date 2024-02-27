public class StudentGradeTable {

    public static void main(String[] args) {
        String[] studentNames = {"Stephen", "William", "Antonio", "Matthew", "Maxwell"};
        int[] labPoints = {43, 50, 39, 48, 45};
        int[] bonusPoints = {7, 8, 10, 6, 9};

        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==\t\tStudent Points\t\t==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");

        System.out.println("Name\t\tLab\tBonus\tTotal");
        System.out.println("----\t\t---\t-----\t-----");

        for (int i = 0; i < studentNames.length; i++) {
            int totalPoints = labPoints[i] + bonusPoints[i];
            System.out.println(studentNames[i] + "\t\t" + labPoints[i] + "\t" + bonusPoints[i] + "\t\t" + totalPoints);
        }
    }
}