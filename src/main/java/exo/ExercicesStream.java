package exo;

import bean.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Exercices sur les Streams Java 8.
 */
public class ExercicesStream implements IExercicesStream {

    /**
     * Ordonner par âge croissant et extraire le nom.
     * Indices : sorted() et Comparator.???
     *
     * @param persons Liste de personnes
     * @return Liste de noms
     */
    @Override
    public List<String> getNamesSortedByAge(final List<Person> persons) {
        //TODO
        return new ArrayList();
    }

    /**
     * Ordonner par âge croissant et concaténer les noms pour affichage avec séparateur, préfixe et suffixe.
     * Indices : Collectors.joining()
     *
     * @param persons Liste de personnes
     * @return "Du plus jeune au plus âgé: <Liste de noms séparés par une virgule>".
     */
    @Override
    public String displayNamesFromYoungestToOldest(final List<Person> persons) {
        //TODO
        return "";
    }

    /**
     * Faire une moyenne des âges.
     * @param persons Liste de personnes
     * @return moyenne des âges
     */
    @Override
    public double averageAge(final List<Person> persons) {
        //TODO
        return 0;
    }

    /**
     * Faire une moyenne des âges des hommes.
     * @param persons Liste de personnes
     * @return moyenne des âges
     */
    @Override
    public double averageAgeMale(final List<Person> persons) {
        //TODO
        return 0;
    }

    /**
     * Faire une moyenne des âges des personnes dont le nom commence par une lettre.
     * @param persons Liste de personnes
     * @param letter initiale
     * @return moyenne des âges
     */
    @Override
    public double averageAgeByInitial(final List<Person> persons, final String letter) {
        //TODO
        return 0;
    }

    /**
     * Faire une moyenne des âges en fonction du sexe.
     * Indices : Collectors.groupingBy, Collector.averagingInt
     * @param persons Liste de personnes
     * @return Map avec la moyenne d'âge en fonction du sexe
     */
    @Override
    public Map<String, Double> averageAgeBySex(final List<Person> persons) {
        //TODO
        return new HashMap<>();
    }


    /**
     * Retourner la liste de personnes qui écoutent un artiste très populaire.
     * Implémentation en Java 8 de la méthode IExercicesStream#getMainstreamMusicListeners()
     * @param persons Liste de personnes
     * @return liste de personnes qui écoutent un artiste très populaire
     */
    @Override
    public List<Person> getMainstreamMusicListenersJava8(final List<Person> persons){
        //TODO
        return new ArrayList();
    }


}
