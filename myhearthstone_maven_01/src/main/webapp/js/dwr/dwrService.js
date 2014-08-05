// Provide a default path to dwr.engine
if (typeof this['dwr'] == 'undefined') this.dwr = {};
if (typeof dwr['engine'] == 'undefined') dwr.engine = {};
if (typeof dwr.engine['_mappedClasses'] == 'undefined') dwr.engine._mappedClasses = {};
 
if (window['dojo']) dojo.provide('dwr.interface.dwrService');
 
if (typeof this['dwrService'] == 'undefined') dwrService = {};
 
dwrService._path = '/spring-mvc-dwr/krams';
 
/**
 * @param {class java.lang.Integer} p0 a param
 * @param {class java.lang.Integer} p1 a param
 * @param {function|Object} callback callback function or options object
 */
dwrService.add = function(p0, p1, callback) {
  return dwr.engine._execute(dwrService._path, 'dwrService', 'add', arguments);
};