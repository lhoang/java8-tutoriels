Ce projet contient des tutoriels pour se faire la main sur les nouvelles API de Java 8.

## Pré-requis :
* Maven installé sur son poste (désolé, c'était le plus simple pour gérer les dépendances) et configuré sur IntelliJ
* Ne pas oublier de bien définir son settings.xml avec

```xml
<mirrors>
    <mirror>
	<mirrorOf>central</mirrorOf>
	<name>ProxyMavenRATP</name>
	<url>http://factory.info.ratp/artifactory/releases</url>
	<id>ProxyMavenRATP</id>
    </mirror>
  </mirrors>
```

## Exercices

### Ressources à lire sur les streams :
 * http://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
 * http://soat.developpez.com/tutoriels/java/projet-lambda-java8/
 * https://www.techempower.com/blog/2013/03/26/everything-about-java-8/
 * http://docs.oracle.com/javase/tutorial/collections/streams/reduction.html

### Ressources à lire sur Optional :
 * http://vanillajava.blogspot.fr/2015/01/java-8-optional-is-not-just-for.html
 * http://www.oracle.com/technetwork/articles/java/java8-optional-2175753.html

### Instructions Optional
 * Implémenter la classe exo.ExerciceOptional pour que les tests ExerciceOptionalTest passent tous.
 * Essayer d'écrire l'équivalent sans Optional.

### Instructions API Streams
Exercice 1 :
 * Implémenter la classe exo.ExerciceStream pour que les tests ExerciceStreamTest passent tous.
 * Réécrire l'implementation en Java 8 de la méthode IExerciceStream#getMainstreamMusicListeners()

Exercice 2 (Attention niveau confirmé) :
 * Implémenter la classe exo.PasswordStats pour que les tests PasswordsStatsTest passent tous



