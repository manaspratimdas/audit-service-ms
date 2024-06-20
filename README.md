**Audit Service**

The Audit Service is designed to collect audit events from various microservices within the system. These events can include user activities, system actions, errors, or any other significant occurrences that need to be recorded. The nature of the event, the timestamp, the source microservice, and other relevant details are encapsulated within each audit event.

Upon receiving these audit events, the Audit Service stores them in a dedicated, secure database or an audit log. This accumulation of audit events over time forms a comprehensive record of significant system activities, which can be referred to for auditing purposes.
