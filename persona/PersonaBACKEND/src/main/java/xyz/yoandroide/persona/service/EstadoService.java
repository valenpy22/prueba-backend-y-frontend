package xyz.yoandroide.persona.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import xyz.yoandroide.persona.model.Estado;
import xyz.yoandroide.persona.repository.EstadoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class EstadoService {
    @Autowired
    private EstadoRepository estadoRepository;


    public List<Estado> findAll() {
        return estadoRepository.findAll();
    }

    public List<Estado> findAllByCountry(Long idPais){
        List<Estado> estadosRespuesta = new ArrayList<>();
        List<Estado> estados = estadoRepository.findAll();
        for(int i = 0; i < estados.size(); i++){
            if(estados.get(i).getPais().getId() == idPais){
                estadosRespuesta.add(estados.get(i));
            }
        }
        return estadosRespuesta;
    }


    public List<Estado> findAll(Sort sort) {
        return estadoRepository.findAll(sort);
    }


    public Page<Estado> findAll(Pageable pageable) {
        return null;
    }


    public List<Estado> findAllById(Iterable<Long> longs) {
        return null;
    }


    public long count() {
        return 0;
    }


    public void deleteById(Long aLong) {

    }


    public void delete(Estado entity) {

    }


    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    public void deleteAll(Iterable<? extends Estado> entities) {

    }


    public void deleteAll() {

    }


    public <S extends Estado> S save(S entity) {
        return null;
    }


    public <S extends Estado> List<S> saveAll(Iterable<S> entities) {
        return null;
    }


    public Optional<Estado> findById(Long aLong) {
        return Optional.empty();
    }


    public boolean existsById(Long aLong) {
        return false;
    }


    public void flush() {

    }


    public <S extends Estado> S saveAndFlush(S entity) {
        return null;
    }


    public <S extends Estado> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }


    public void deleteAllInBatch(Iterable<Estado> entities) {

    }


    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }


    public void deleteAllInBatch() {

    }


    public Estado getOne(Long aLong) {
        return null;
    }


    public Estado getById(Long aLong) {
        return null;
    }


    public Estado getReferenceById(Long aLong) {
        return null;
    }


    public <S extends Estado> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }


    public <S extends Estado> List<S> findAll(Example<S> example) {
        return null;
    }


    public <S extends Estado> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }


    public <S extends Estado> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }


    public <S extends Estado> long count(Example<S> example) {
        return 0;
    }


    public <S extends Estado> boolean exists(Example<S> example) {
        return false;
    }


    public <S extends Estado, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
