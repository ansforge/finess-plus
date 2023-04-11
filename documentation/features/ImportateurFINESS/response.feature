Fonctionnalité: Génération d'un fichier texte avec la réponse de traitement et des informations utiles pour un système externe qui demande une importation en batch via le SyncroParLotFiness

Contexte: Le SyncroParLotFiness doit importer des données à partir d'un fichier texte et les envoyer au FINESS+ via son API. Le système externe qui demande l'importation peut avoir besoin de recevoir une réponse de traitement détaillée.

Background:
    Étant donné que le SyncroParLotFiness est disponible
    Et que le FINESS+ est disponible pour recevoir les données via son API
    Lorsque le SyncroParLotFiness commence la lecture du fichier texte
    Alors le SyncroParLotFiness extrait les données à partir du fichier texte
    Et le SyncroParLotFiness envoie les données au FINESS+ en utilisant son API pour les insérer dans le dépôt

Scénario: Génération d'un fichier texte avec la réponse de traitement et des informations utiles
    Et le SyncroParLotFiness stocke les erreurs, s'il y en a, dans une file d'attente pour un traitement ultérieur
    Et le SyncroParLotFiness génère un fichier texte de réponse avec les détails de traitement et des informations utiles
    Et le SyncroParLotFiness envoie le fichier texte de réponse au système externe qui demande l'importation en batch

Scénario: Le fichier texte de réponse ne peut pas être généré
    Mais une erreur se produit pendant le traitement des données
    Alors le SyncroParLotFiness stocke l'erreur dans une file d'attente pour un traitement ultérieur
    Et le SyncroParLotFiness ne génère pas de fichier texte de réponse
    Et le SyncroParLotFiness envoie un message d'erreur au système externe qui demande l'importation en batch