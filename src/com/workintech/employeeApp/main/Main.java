package com.workintech.employeeApp.main;

import com.workintech.employeeApp.enums.Plan;
import com.workintech.employeeApp.model.Employee;
import com.workintech.employeeApp.model.Healthplan;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Healthplan plan1 = new Healthplan(1, "X Sigorta", Plan.ADVANCE);
        Healthplan plan2 = new Healthplan(2, "Y Sigorta", Plan.NORMAL);

        String[] healthplans = new String[3];
        healthplans[0] = plan1.getName();
        healthplans[1] = plan2.getName();
        Employee developer = new Employee(1, "Ali Cabbar", "ali@cbr", "1234", healthplans);
        developer.addHealthplan(0, "Z Sigorta");


        System.out.println(developer);
    }

    /**
     * Bu projenin ana(com.workintech.employeeApp.main) metodu. Java uygulamalarında com.workintech.employeeApp.main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
