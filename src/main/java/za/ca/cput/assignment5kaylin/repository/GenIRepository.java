package za.ca.cput.assignment5kaylin.repository;

public interface GenIRepository<T, ID>
{
    T create(T t);
    T read(ID id);
    T update(T t);
    void delete(ID id);
}
