
1.  Below property is used to create able automatically in DB. 
spring.jpa.hibernate.ddl-auto=update   
    
2. Auto increment ID in DB :  using hibernate sequence
   @GeneratedValue
   
3. Below is code for custom sequence generator in Oracle DB
   @Id
   @Column(name = "RESOURCE_ID")  
   // Below is code for custom sequence generator in Oracle DB
   @SequenceGenerator(name = "req_seq",sequenceName = "resource_id_seq",allocationSize = 1)
   @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "req_seq")
   private Integer resourceId;

---------
Below table created automatically using STEP 1:

CREATE TABLE "RESOURCE_DTLS"
(	"RESOURCE_ID" NUMBER(10,0) NOT NULL ENABLE,
"RESOURCE_EXPR" VARCHAR2(255 CHAR),
"RESOURCE_NAME" VARCHAR2(255 CHAR),
"RESOURCE_SKILL" VARCHAR2(255 CHAR),
PRIMARY KEY ("RESOURCE_ID")
);
