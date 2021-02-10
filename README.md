
1.  Below property is used to create able automatically in DB. 
spring.jpa.hibernate.ddl-auto=update   
    
2. Auto increment ID in DB :  using hibernate sequence
   @GeneratedValue
   
3. Below is code for custom sequence generator in Oracle DB
   // @SequenceGenerator(name = "req_seq",sequenceName = "<Actual sequnce name>",allocationSize = 1)
   // @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "req_seq")
   private Integer resourceId;

---------
Below table created automatically using STEP 1:

CREATE TABLE `resource_dtls` (
`resource_id` int(11) NOT NULL,
`resource_expr` varchar(255) DEFAULT NULL,
`resource_name` varchar(255) DEFAULT NULL,
`resource_skill` varchar(255) DEFAULT NULL,
PRIMARY KEY (`resource_id`)
) ;
