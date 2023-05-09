L’azienda Tregatti s.r.l. vi commissiona la realizzazione di un servizio di backend per la
gestione di un dizionario.
1) Creare un’entità “Word” con i seguenti campi:
- id: String
- displayText: String
- description: String
2) Implementare un endpoint “/words” per effettuare operazioni CRUD su “Word”.
   Evitare l’utilizzo di generatori automatici quali @RepositoryRestResource
3) Implementare un Interceptor “RequestMethodStatisticsCollector” che conta quante
   richieste per ogni metodo vengono effettuate (GET, POST, DELETE ecc...).
4) Implementare un Interceptor “ResponseStatusStatisticsCollector” che conta per ogni
   possibile status code (200, 404, 500...) quante risposte sono state restituite con
   quello specifico status.
5) Implementare un controller “StatisticsController” che implementi alcuni endpoint che
   restituiscano le statistiche su richieste e risposte in JSOn.
   La tipologia di statistiche ed il formato con cui vengono restituite è estendibile a piacimento
   una volta terminata l’implementazione di base dell’esercizio.
   Consiglio: realizzare i sistemi di salvataggio delle statistiche con Component con visibilità
   “Singleton”, o comunque usando elementi analoghi. 

