import datapreprocessor.utils.ImportData;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ImportDataTest {

    ImportData importData = new ImportData();

    @Test
    public void dataCollectionTest() {
        assertEquals (importData.dataCollection()
                .get(0)
                .getModel().length(),5);
    }

}
