package exo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Statistiques sur les mots de passes. Solution.
 */
public class PasswordStats implements IPasswordStats {

    /**
     * N'est pas vide.
     */
    public Predicate<String> isNotBlank = s -> s != null && s.length() > 0;

    /**
     * Contient au moins une lettre capitale.
     */
    public Predicate<String> hasUppercase = s -> s.matches(".*[A-Z]+.*");

    /**
     * Contient au moins une lettre minuscule.
     */
    public Predicate<String> hasLowercase = s -> s.matches(".*[a-z]+.*");

    /**
     * Contient au moins un chiffre.
     */
    public Predicate<String> hasNumber = s -> s.matches(".*[0-9]+.*");

    /**
     * Contient au moins un caractère spécial.
     */
    public Predicate<String> hasSpecial = s -> s.matches(".*[ !\"#$%&'()*+,-\\./:;<=>?@\\[\\]^_`{|}~]+.*");

    /**
     * Est assez long (8).
     */
    public Predicate<String> isLongEnough = s -> s.length() >= 8;

    /**
     * N'est pas trop long (128).
     */
    public Predicate<String> isNotTooLong = s -> s.length() <= 128;

    /**
     * N'a pas plus 2 caractères identiques à la suite.
     */
    public Predicate<String> hasNoRepetition = s -> !s.matches(".*(.)\\1\\1+.*");

    /**
     * Est un mot de passe costaud.
     * TODO : Composer les prédicats.
     */
    public Predicate<String> isStrongPassword =
            //TODO
            isNotBlank;

    /**
     * Est un mot de passe costaud.
     * @param password Mot de passe à tester
     * @return true si mot de passe fort
     */
    @Override
    public boolean isStrongPassword(String password) {
        return isStrongPassword.test(password);
    }

    /**
     * Retourne tous les mots de passe ayant au moins un chiffre.
     * Indices : Récupérer le flux du Supplier et filtrer
     *
     * @param allPasswords Stream de mots de passe
     * @return tous ces mots de passe
     */
    @Override
    public List<String> getAllWithNumbers(Supplier<Stream<String>> allPasswords) {
        //TODO
        return new ArrayList<>();
    }

    /**
     * Retourne tous les mots de passe ayant au moins une lettre capitale et une minuscule.
     * @param allPasswords Stream de mots de passe
     * @return tous ces mots de passe
     */
    @Override
    public List<String> getAllWithUppercaseAndLowercase(Supplier<Stream<String>> allPasswords) {
        //TODO
        return new ArrayList<>();
    }

    /**
     * Retourne tous les mots de passe ayant au moins un caractère spécial.
     * @param allPasswords Stream de mots de passe
     * @return tous ces mots de passe
     */
    @Override
    public List<String> getAllWithSpecialChars(Supplier<Stream<String>> allPasswords) {
        //TODO
        return new ArrayList<>();
    }

    /**
     * Retourne tous les mots de passe forts.
     * @param allPasswords Stream de mots de passe
     * @return tous ces mots de passe
     */
    @Override
    public List<String> getAllStrong(Supplier<Stream<String>> allPasswords) {
        //TODO
        return new ArrayList<>();
    }

    /**
     * Compte les mots de passe en fonction de leur position dans le mot.
     * Indices si vous êtes bloqué:
     * 1/ Filtrer
     * 2/ Transformer (map) en Liste de positions du caractère spécial
     *    (avec exo.IPasswordStats#getIndexOfSpecialChar(java.lang.String))
     * 3/ Ecraser la List<List<Integer>> en Liste<Integer> (flatMap(i -> i.stream()))
     * 4/ Créer une Map en regroupant par Position et compter les occurrences.
     *    le lambda x -> x est l'équivalent de Function.identity()
     *
     * @param allPasswords Stream de mots de passe
     * @return Map<Position du char, compte>
     */
    @Override
    public Map<Integer, Long> countBySpecialCharPosition(Supplier<Stream<String>> allPasswords) {
        //TODO
        return new HashMap<>();
    }

    /**
     * Renvoie la liste des mots de passe avec caractère spécial en fonction de la position du caractère spécial.
     * Indices si vous êtes bloqué:
     * 1/ Filtrer
     * 2/a Pour chaque password, récupérer les positions des caractères spéciaux,
     * 2/b Parcourir ces positions et construire une paire (Position, Password)
     *     avec new AbstractMap.SimpleEntry<>(K, V)
     * 3/ Ecraser la collection Liste de Liste de paires en liste de paires
     * 4/ Grouper avec clé en construisant une liste des passwords correspondants
     *    avec grouping, mapping et toList()
     *
     * @param allPasswords Stream de mots de passe
     * @return Map<Position du char, Liste des mots de passe.>
     */
    @Override
    public Map<Integer, List<String>> getAllBySpecialCharPosition(Supplier<Stream<String>> allPasswords) {
        //TODO
        return new HashMap<>();
    }

    /**
     * Renvoie la liste des mots de passe avec un seul caractère spécial à la fin.
     * Indices si vous êtes bloqué:
     * filter directement en vérifiant qu'il n'y a qu'un caractère spécial
     * et que sa position est à la fin du mot de passe.
     *
     * @param allPasswords Stream de mots de passe
     * @return tous ces mots de passe
     */
    @Override
    public List<String> getAllWithOnlyOneLastSpecialChar(Supplier<Stream<String>> allPasswords) {
        //TODO
        return new ArrayList<>();
    }
}
