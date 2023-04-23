package xyz.yoandroide.persona.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import xyz.yoandroide.persona.model.Pais;
import xyz.yoandroide.persona.repository.PaisRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class PaisService {
    @Autowired
    private PaisRepository paisRepository;


    public List<Pais> findAll() {
        return paisRepository.findAll();
    }


    public List<Pais> findAll(Sort sort) {
        return paisRepository.findAll(sort);
    }


    public Page<Pais> findAll(Pageable pageable) {
        return null;
    }


    public List<Pais> findAllById(Iterable<Long> longs) {
        return null;
    }


    public long count() {
        return 0;
    }


    public void deleteById(Long aLong) {

    }


    public void delete(Pais entity) {

    }


    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    public void deleteAll(Iterable<? extends Pais> entities) {

    }


    public void deleteAll() {

    }


    public <S extends Pais> S save(S entity) {
        return paisRepository.save(entity);
    }

    public <S extends Pais> List<S> saveAll(Iterable<S> entities) {
        return null;
    }


    public Optional<Pais> findById(Long aLong) {
        return Optional.empty();
    }

    public boolean existsById(Long aLong) {
        return false;
    }


    public void flush() {

    }


    public <S extends Pais> S saveAndFlush(S entity) {
        return null;
    }


    public <S extends Pais> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }


    public void deleteAllInBatch(Iterable<Pais> entities) {

    }


    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }


    public void deleteAllInBatch() {

    }


    public Pais getOne(Long aLong) {
        return null;
    }


    public Pais getById(Long aLong) {
        return null;
    }


    public Pais getReferenceById(Long aLong) {
        return null;
    }


    public <S extends Pais> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }


    public <S extends Pais> List<S> findAll(Example<S> example) {
        return null;
    }


    public <S extends Pais> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }


    public <S extends Pais> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }


    public <S extends Pais> long count(Example<S> example) {
        return 0;
    }


    public <S extends Pais> boolean exists(Example<S> example) {
        return false;
    }


    public <S extends Pais, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
