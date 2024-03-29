Fonctionnalité: Traitement asynchrone d'un fichier texte pour insérer des données dans un BDD en utilisant l'API de FINESS+

# Note : Les étapes de connexion et d'insertion de données dans la BDD via l'API exposée par le service FINESS+ sont incluses dans les scénarios. Cependant, il est important de noter que l'implémentation exacte de ces étapes peut varier en fonction des spécifications techniques du FINESS+ et des exigences de l'application.

Contexte: Un fichier texte contenant des données à insérer dans la BDD FINESS+ est disponible pour être traité par le micro-service SyncroParLotFiness. Et que FINESS+  expose une API pour insérer des données dans son BDD.
Background:
    Étant donné que SyncroParLotFiness est disponible
	Étant donné que FINESS+ est disponible

Scénario: Traitement asynchrone du fichier texte pour insérer des données dans la BDD FINESS+
    Lorsque le SyncroParLotFiness commence la lecture du fichier texte
    Alors le SyncroParLotFiness extrait les données à partir du fichier texte
    Et SyncroParLotFiness envoie les données au service FINESS+ en utilisant son API.
    Et le SyncroParLotFiness stocke les erreurs, s'il y en a, dans une file d'attente pour un traitement ultérieur.

Scénario: Traitement asynchrone du fichier texte échoue
    Lorsque le SyncroParLotFiness commence la lecture du fichier texte
    Mais une erreur se produit pendant le traitement des données
    Alors le SyncroParLotFiness stocke l'erreur dans une file d'attente pour un traitement ultérieur.

Scénario: Reprocessing de la file d'attente
    Et qu'une file d'attente d'erreurs existe
    Lorsque le SyncroParLotFiness commence le retraitement de la file d'attente
    Alors le SyncroParLotFiness envoie les données stockées dans la file d'attente au FINESS+ en utilisant son API pour les insérer dans la BDD FINESS+
    Et le SyncroParLotFiness supprime les erreurs de la file d'attente après leur traitement.
	
Scénario: Reste des erreurs dans la file d'attente après le retraitement
    Et qu'une file d'attente d'erreurs existe toujours après le retraitement
	Alors le SyncroParLotFiness stocke les erreurs persistant, dans une nouvelle file d'attente pour un traitement ultérieur
    Et le SyncroParLotFiness supprime les erreurs de la file d'attente principal.
    Et le SyncroParLotFiness envoie un e-mail à l'administrateur pour l'informer des erreurs restantes