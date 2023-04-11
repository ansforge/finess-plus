Fonctionnalité: Configuration de la réponse pour l'exportation en batch via le FINESS+

# Note : Le scénario ci-dessus suppose que la réponse peut être configurée via une interface d'administration ou un fichier de configuration. Les détails de l'implémentation peuvent varier en fonction des exigences de l'application et des contraintes techniques.

Contexte: Le SyncroParLotFiness doit importer des données à partir d'un fichier texte et les envoyer au FINESS+ via son API. Le système externe qui demande l'importation peut avoir besoin de recevoir une réponse de traitement détaillée. Les détails de la réponse peuvent être configurés.

Background:
    Étant donné que le SyncroParLotFiness est disponible

Scénario: Configuration de la réponse pour l'importation en batch via le FINESS+
    Lorsque l'administrateur accède à l'interface de configuration de la réponse
    Alors l'administrateur peut sélectionner les détails de la réponse à inclure
    Et l'administrateur peut configurer le format de la réponse
    Et l'administrateur peut enregistrer la configuration pour une utilisation ultérieure

Scénario: Utilisation de la configuration de la réponse pour l'importation de données
    Et que la configuration de la réponse a été enregistrée
    Lorsque le SyncroParLotFiness commence la lecture du fichier texte
    Alors le SyncroParLotFiness extrait les données à partir du fichier texte
    Et le SyncroParLotFiness envoie les données au FINESS+ en utilisant son API pour les insérer dans le dépôt
    Et le SyncroParLotFiness stocke les erreurs, s'il y en a, dans une file d'attente pour un traitement ultérieur
    Et le SyncroParLotFiness génère une réponse de traitement en utilisant la configuration enregistrée
    Et le SyncroParLotFiness envoie la réponse de traitement au système externe qui demande l'importation en batch
