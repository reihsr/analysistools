package at.medunigraz.pathology.bibbox.datatools.database;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Session;
import org.neo4j.driver.Result;
import org.neo4j.driver.Transaction;
import org.neo4j.driver.TransactionWork;

import static org.neo4j.driver.Values.parameters;

public class Neo4jDatabaseTesting// implements AutoCloseable
{
    /*
    private final Driver driver;

    public Neo4jDatabaseTesting( String uri, String user, String password )
    {
        driver = GraphDatabase.driver( uri, AuthTokens.basic( user, password ) );
    }

    @Override
    public void close() throws Exception
    {
        driver.close();
    }

    public void printGreeting( final String message )
    {
        try ( Session session = driver.session() )
        {
            String greeting = session.writeTransaction( new TransactionWork<String>()
            {
                @Override
                public String execute( Transaction tx )
                {
                    Result result = tx.run( "CREATE (a:Tocken) " +
                                    "SET a.tocken = $message " +
                                    "RETURN a.message + ', from node ' + id(a)",
                            parameters( "message", message ) );
                    return result.single().get( 0 ).asString();
                }
            } );
            System.out.println( greeting );
        }
    }

    public void createNodeLink(final String tocken1, final String seperator, final String tocken2) {
        //MERGE (n {name: '3'})
        try ( Session session = driver.session() )
        {
            String greeting = session.writeTransaction( new TransactionWork<String>()
            {
                @Override
                public String execute( Transaction tx )
                {
                    Result result = tx.run("MERGE (t1:Tocken {tocken: $tocken1}) " +
                            "MERGE (t2:Tocken {tocken: $tocken2}) " +
                            "MERGE (t1)-[:followes {seperator: $seperator}]->(t2) ", parameters("tocken1", tocken1, "tocken2", tocken2, "seperator", seperator));
                    return "";//result.single().get(0).asString();
                }
            } );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main( String... args )
    {
        try {
            try ( Neo4jDatabaseTesting greeter = new Neo4jDatabaseTesting( "bolt://localhost:7687", "neo4j", "fenris" ) )
            {
                greeter.printGreeting( "hello, world" );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}