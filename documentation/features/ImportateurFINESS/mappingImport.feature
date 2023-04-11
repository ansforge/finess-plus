Fonctionnalité: Configuration du mappage entre le format de fichier texte et le format de l'API du FINESS+

# Note : Le scénario ci-dessus suppose que la réponse peut être configurée via une interface d'administration ou un fichier de configuration. Les détails de l'implémentation peuvent varier en fonction des exigences de l'application et des contraintes techniques.

Contexte: Le SyncroParLotFiness doit importer des données à partir d'un fichier texte et les envoyer au FINESS+ via son API. Le mappage entre les champs du fichier texte et les champs de l'API du FINESS+ doit être configuré.

Background: disponibilite
    Étant donné que le SyncroParLotFiness est disponible

Scénario: Configuration du mappage entre le format de fichier texte et le format de l'API du FINESS+
    Lorsque l'administrateur accède à l'interface de configuration du mappage
    Alors l'administrateur peut mapper les champs sélectionnés avec les champs de l'API du FINESS+
    Et l'administrateur peut enregistrer le mappage configuré pour une utilisation ultérieure

Scénario: Utilisation du mappage configuré pour l'importation de données
    Et que le mappage a été configuré pour les champs du fichier texte à importer
    Lorsque le SyncroParLotFiness commence la lecture du fichier texte
    Alors le SyncroParLotFiness extrait les données à partir du fichier texte en utilisant le mappage configuré
    Et le SyncroParLotFiness envoie les données au FINESS+ en utilisant son API pour les insérer dans la BDD
    Et le SyncroParLotFiness stocke les erreurs, s'il y en a, dans une file d'attente pour un traitement ultérieur



