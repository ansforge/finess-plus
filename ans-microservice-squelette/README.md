# Squelette base  en java: Enregistrez le code standard dans vos nouveaux projets

## Introduction

Ce dépôt est destiné à servir de point de départ si vous souhaitez initialiser un projet Java avec JUnit et Gradle.

## Comment commencer

1. Installez Java 8 : ` command here `
2. Définissez-le comme votre JVM par défaut : `export JAVA_HOME='path here'`
3. Clonez ce dépôt : `git clone https://...`.
4. Exécutez certaines [tâches du cycle de vie Gradle](https://docs.gradle.org/current/userguide/java_plugin.html#lifecycle_tasks) afin de vérifier que tout est en ordre :
    1. Créez [le JAR du projet](https://docs.gradle.org/current/userguide/java_plugin.html#sec:jar) : `make build`
    2. Exécutez les tests et les tâches de vérification des plugins : `make test`
5. Commencez à développer !

## ☝️ Comment mettre à jour les dépendances

* Gradle (version actuelle : 5.6 - [versions](https://gradle.org/releases/)) :
`./gradlew wrapper --gradle-version=5.6 --distribution-type=bin` ou en modifiant le fichier [gradle-wrapper.properties](gradle/wrapper/gradle-wrapper.properties#L3)
* JUnit (version actuelle : 5.5.1 - [versions](https://junit.org/junit5/docs/snapshot/release-notes/index.html)) :
[`build.gradle:11`](build.gradle#L11-L12)
