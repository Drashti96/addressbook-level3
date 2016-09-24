package seedu.addressbook.storage;
import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.Storage.StorageOperationException;

public class StorageStub {
    public StorageStub(String path) {

    }
    public void save(AddressBook addressBook) throws StorageOperationException {

    }
    public AddressBook load() throws StorageOperationException {
        return new AddressBook();
    }
    public String getPath() {
        return null;
    }
}
