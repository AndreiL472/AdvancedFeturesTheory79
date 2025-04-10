package org.example.part1_class_types.class_interface;

/*
        Ce este?
           O interfata este o clasa care defineste un contract de implementare al unor metode functionale
           De regula contine doar declaratia metodelor SIMILAR claselor abstracte care pot stoca metode abstrate.

           Interface abd = new ImplemantationClass();
           ImplemantationClass implements interfaceClass

         Cant le utilizam?
            - cand dorim sa decuplam partea functinala a unei serii de clase in scopul generalizarii
            - cand vrem sa imbunatatim optimizam ierarhiilor

         Intrebare capcana: Se poata face in java MULTIPLE INHERITANCE (mostenire multipla)
            - ChildClass extends parentClas1, corect putem
            - ChildClass extends parentClas1, parentClass -> incorect, nu putem.

            - putem simula o pseudo multipla dpdv al comportamentului functional
            - ChildClass implements ParenInterface1, ParenInterface2, ParenInterface3, ParenInterface4 -> corect, putem
              --inseamna ca ChildClass va implementa TOATE METODELE din fiecare interfata

            - ChildCLass extends ParentClass implements ParenInterface1, ParenInterface2, ParenInterface3, ParenInterface4
             --ParentClass va stoca TOATE atributele generice pe care am putea sa le avem in ParentClass 1,2,3,4...
             --Interfetele vor decupla contractul complementului al metodelor functionale pe mai multe interfete
             specifuce.
 */

public interface interfaceAnimal {

    void doSount();
}
