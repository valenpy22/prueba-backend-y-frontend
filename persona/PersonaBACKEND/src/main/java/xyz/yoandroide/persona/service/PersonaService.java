package xyz.yoandroide.persona.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import xyz.yoandroide.persona.model.Persona;
import xyz.yoandroide.persona.repository.PersonaRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class PersonaService{
    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    public List<Persona> findAll(Sort sort) {
        return personaRepository.findAll(sort);
    }


    public Page<Persona> findAll(Pageable pageable) {
        return null;
    }

    public List<Persona> findAllById(Iterable<Long> longs) {
        return null;
    }


    public long count() {
        return personaRepository.count();
    }

    public void deleteById(Long aLong) {
        personaRepository.deleteById(aLong);
    }

    public void delete(Persona entity) {
        personaRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends Long> longs) {

    }


    public void deleteAll(Iterable<? extends Persona> entities) {

    }


    public void deleteAll() {

    }


    public <S extends Persona> S save(S entity) {
        return personaRepository.save(entity);
    }


    public <S extends Persona> List<S> saveAll(Iterable<S> entities) {
        return null;
    }


    public Optional<Persona> findById(Long aLong) {
        return Optional.empty();
    }

    public boolean existsById(Long aLong) {
        return false;
    }


    public void flush() {

    }


    public <S extends Persona> S saveAndFlush(S entity) {
        return null;
    }


    public <S extends Persona> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }


    public void deleteAllInBatch(Iterable<Persona> entities) {

    }


    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }


    public void deleteAllInBatch() {

    }


    public Persona getOne(Long aLong) {
        return null;
    }


    public Persona getById(Long aLong) {
        return null;
    }


    public Persona getReferenceById(Long aLong) {
        return null;
    }


    public <S extends Persona> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }


    public <S extends Persona> List<S> findAll(Example<S> example) {
        return null;
    }


    public <S extends Persona> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }


    public <S extends Persona> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }


    public <S extends Persona> long count(Example<S> example) {
        return 0;
    }


    public <S extends Persona> boolean exists(Example<S> example) {
        return false;
    }


    public <S extends Persona, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
