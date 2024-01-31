package HomeWork;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Kids> kids = new ArrayList<>();
        ArrayList<Group> group = new ArrayList<>();


        Kids kids1 = new Kids("Иванов Андрей", 'м',3);
        Kids kids2 = new Kids("Сургутов Максим", 'м',4);
        Kids kids3 = new Kids("Волкова Алена", 'ж',5);
        Kids kids4 = new Kids("Андросенко Евгения", 'ж',7);

        //Редактирование ребенка.
       // kids4.refactorKids("Медведева Анастасия", 'ж',4);

        kids.add(kids1);
        kids.add(kids2);
        kids.add(kids3);
        kids.add(kids4);

        //Удаление ребенка.
       // kids.remove(kids3);



        Group group1 = new Group("Солнышко", 1);
        Group group2 = new Group("Луна", 2);

        group.add(group1);
        group.add(group2);

        group1.addKids(kids1);
        group1.addKids(kids4);
        group2.addKids(kids2);
        group2.addKids(kids3);

        group1.showInfo();
        group2.showInfo();






        }
    }
